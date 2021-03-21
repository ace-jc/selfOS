from flask import request
from flask import Flask
import Person
from flask_cors import CORS
import json

app = Flask(__name__)
CORS(app)


@app.route('/addPerson', methods=['POST'])
def person():
    try:
        raw_form_data = request.form  # data is empty
        form_data = json.loads(raw_form_data["formData"])
        record = Person.Person(form_data["firstname"], form_data["lastname"], form_data["imageurl"], form_data["phone"],
                          form_data["email"], form_data["streetAddress"], form_data["aptNumber"], form_data["city"],
                          form_data["state"], form_data["zipcode"])
        return "added record"
    except Exception as e:
        print(e)


if __name__ == "__main__":
    app.run()
