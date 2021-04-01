import React from 'react';

import "./Person.css";
import person from './contact.png';



class Person extends React.Component{

  constructor(props){
    super(props)
  }

  render(){
    // ensure we have image URL otherwise return the default imageUrl
    if(this.props.value.imageUrl == null || this.props.value.imageUrl == ""){
      return(
        <div class="person">
          <span class="span"><img class="img" src={person} /></span>
          <span>{this.props.value.firstName} {this.props.value.lastName}</span>
        </div>
      )
    }else{
      return(
        <div class="person">
          <span class="span"><img class="img" src={this.props.value.imageUrl} /></span>
          <span>{this.props.value.firstName} {this.props.value.lastName}</span>
        </div>
      )
    }
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
