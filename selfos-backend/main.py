from flask import request
from flask import Flask
import Person
import People
from flask_cors import CORS
import json
import IoUtils
import os


app = Flask(__name__)
app.config.from_pyfile(os.path.join(".", "config/app.conf"), silent=False)
CORS(app)


@app.route('/addPerson', methods=['POST'])
def person():
    try:
        # extract the form data passed by UI.. create an update record object
        form_data = json.loads(request.form["formData"])
        newRecordToAdd = Person.Person(form_data["firstname"], form_data["lastname"], form_data["imageurl"], form_data["phone"],
                          form_data["email"], form_data["streetAddress"], form_data["aptNumber"], form_data["city"],
                          form_data["state"], form_data["zipcode"])

        # get contacts from contacts location
        contacts = IoUtils.getContacts(app.config.get("STORAGE_LOCATION"))
        peopleFile = People.People(contacts)

        # ensure contact does not exist.. if doesn't exist add contact..
        if peopleFile.contactDoesNotExist():
            # add entry
            IoUtils.addContactToFile(app.config.get("STORAGE_LOCATION"), peopleFile, newRecordToAdd)
            # return 200 response to caller
            return "added record"

        else:
            # otherwise return error
            return "error", 400

    except Exception as e:
        print(e)
        return "error"


if __name__ == "__main__":
    app.run()
