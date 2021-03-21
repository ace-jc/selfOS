import React, {useState} from "react";
import './Form.css';

function BasicForm(){
  const [firstname, setFirstname] = useState('')
  const [lastname, setLastname] = useState('')
  const [imageurl, setImageurl] = useState('')
  const [phone, setPhone] = useState('')
  const [email, setEmail] = useState('')
  const [streetAddress, setStreetAddress] = useState('')
  const [aptNumber, setAptNumber] = useState('')
  const [city, setCity] = useState('')
  const [state, setState] = useState('')
  const [zipcode, setZipcode] = useState('')

  const handleFirstNameChange = event => {
    setFirstname(event.target.value)
  };
  const handleLastNameChange = event => {
    setLastname(event.target.value)
  };
  const handleImageUrlChange = event => {
    setImageurl(event.target.value)
  };
  const handlePhoneChange = event => {
    setPhone(event.target.value)
  };
  const handleEmailChange = event => {
    setEmail(event.target.value)
  };
  const handleStreetAddress = event => {
    setStreetAddress(event.target.value)
  };
  const handleAptNumber = event => {
    setAptNumber(event.target.value)
  };
  const handleCity = event => {
    setCity(event.target.value)
  };
  const handleState = event => {
    setState(event.target.value)
  };
  const handleZipcode = event => {
    setZipcode(event.target.value)
  };


  const handleSubmit = event => {
    event.preventDefault();
    alert(`Your state values: \n
            first name: ${firstname} \n
            last name: ${lastname} \n
            image url: ${imageurl} \n
            phone: ${phone} \n
            email: ${email} \n
            streetAddress: ${streetAddress} \n
            aptNumber: ${aptNumber} \n
            city: ${city} \n
            state: ${state} \n
            zipcode: ${zipcode} \n
            You can replace this alert with your process`);
  };

  return (
    <form onSubmit={handleSubmit}>
      <div class="newContactLineEntry">
        <label>First Name: </label>
        <input
          type="firstname"
          name="firstname"
          placeholder="Enter First Name"
          onChange={handleFirstNameChange}
          value={firstname}
        />
      </div>
      <div class="newContactLineEntry">
        <label>Last Name: </label>
        <input
          type="lastname"
          name="lastname"
          placeholder="Enter Last Name"
          onChange={handleLastNameChange}
          value={lastname}
        />
      </div>
      <div class="newContactLineEntry">
        <label>Image Url: </label>
        <input
          type="imageurl"
          name="imageurl"
          placeholder="Enter image URL"
          onChange={handleImageUrlChange}
          value={imageurl}
        />
      </div>
      <div class="newContactLineEntry">
        <label>Phone: </label>
        <input
          type="phone"
          name="phone"
          placeholder="Enter Phone Number"
          onChange={handlePhoneChange}
          value={phone}
        />
      </div>
      <div class="newContactLineEntry">
        <label>Email address: </label>
        <input
          type="email"
          name="email"
          placeholder="Enter Email"
          onChange={handleEmailChange}
          value={email}
        />
      </div>
      <div class="newContactLineEntry">
        <label>Street Address: </label>
        <input
          type="streetAddress"
          name="streetAddress"
          placeholder="Enter Street Address"
          onChange={handleStreetAddress}
          value={streetAddress}
        />
      </div>
      <div class="newContactLineEntry">
        <label>Apt Number: </label>
        <input
          type="aptNumber"
          name="aptNumber"
          placeholder="Enter Apt Number"
          onChange={handleAptNumber}
          value={aptNumber}
        />
      </div>
      <div class="newContactLineEntry">
        <label>City: </label>
        <input
          type="city"
          name="city"
          placeholder="Enter City"
          onChange={handleCity}
          value={city}
        />
      </div>
      <div class="newContactLineEntry">
        <label>State: </label>
        <input
          type="state"
          name="state"
          placeholder="Enter State"
          onChange={handleState}
          value={state}
        />
      </div>
      <div class="newContactLineEntry">
        <label>Zip Code: </label>
        <input
          type="zipcode"
          name="zipcode"
          placeholder="Enter Zip Code"
          onChange={handleZipcode}
          value={zipcode}
        />
      </div>
      <button type="submit" class="submit">
        Submit
      </button>
    </form>
  )
}

export default BasicForm