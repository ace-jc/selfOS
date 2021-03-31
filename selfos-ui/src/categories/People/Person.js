import React from 'react';


class Person extends React.Component{

  constructor(props){
    super(props)
  }

  render(){

    this.props.value.forEach((entry) => {
      console.log(entry.firstName)
      console.log(entry.lastName)
    });

    return(<div>b</div>)
  }

}

export default Person;
