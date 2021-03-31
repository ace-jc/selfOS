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

}

export default Person;
