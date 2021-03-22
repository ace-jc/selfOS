class Person:
    def __init__(self, firstname, lastname, imageurl, phone, email, streetAddress, aptNumber, city, state, zipcode):
        self.firstname = firstname
        self.lastname = lastname
        self.imageurl = imageurl
        self.phone = phone
        self.email = email
        self.streetAddress = streetAddress
        self.aptNumber = aptNumber
        self.city = city
        self.state = state
        self.zipcode = zipcode


    def __repr__(self):
        return self.firstname + self.lastname + self.imageurl + self.phone + self.email + self.streetAddress + \
               self.aptNumber + self.city + self.state + self.zipcode


    def jsonObject(self):
        personDict = dict()
        personDict["firstname"] = self.firstname
        personDict["lastname"] = self.lastname
        personDict["imageurl"] = self.imageurl
        personDict["phone"] = self.phone
        personDict["email"] = self.email
        personDict["streetAddress"] = self.streetAddress
        personDict["aptNumber"] = self.aptNumber
        personDict["city"] = self.city
        personDict["state"] = self.state
        personDict["zipcode"] = self.zipcode
        return personDict
