import json


def getContacts(location):
    # return contacts file with all entries
    contactsFile = open(location, "r")
    readContactsFile = contactsFile.read()
    return json.loads(readContactsFile)


# add given entry to contacts and save in filesystem
def addContactToFile(storageLocation, peopleFile, newRecordToAdd):
    # if people file has zero entries add record to location directly
    if peopleFile.quantityOfContacts() == 0:
        print(json.dumps(newRecordToAdd.jsonObject()))
        # calculate file contents
        fileContentsToWrite = "[" + json.dumps(newRecordToAdd.jsonObject()) + "]"

        # write to file
        updatedFile = open(storageLocation, "w")
        updatedFile.write(fileContentsToWrite)
        updatedFile.close()

    # TODO: need to add other records
