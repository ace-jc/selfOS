import React from 'react';

import "./Person.css";


class Person extends React.Component{

  constructor(props){
    super(props)
  }

  render(){
    console.log(this.props.value);
    return(<div class="person">{this.props.value.lastName}</div>)
  }

  //           {home.firstName}
  //           {home.lastName}
  //           {home.city}
  //           {home.aptNumber}
  //           {home.email}
  //           {home.id}
  //           {home.imageUrl}
  //           {home.phone}
  //           {home.state}
  //           {home.streetAddress}
  //           {home.zipCode}
  //           {home.lastName}
  //           {home.lastName}
  //           </div>)}

}

export default Person;
