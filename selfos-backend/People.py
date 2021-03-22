class People:

    numberOfContacts = 0

    def __init__(self, file):
        for currRecord in file:
            # TODO: need to add all Persons to People list here
            self.numberOfContacts += 1


    # check if the contact is in the people list
    def contactDoesNotExist(self):
        # if entries are empty.. the file is blank return true
        if self.numberOfContacts == 0:
            return True
        # TODO: Need to check if a person already exists or closely matches a currently existing person


    def quantityOfContacts(self):
        return self.numberOfContacts