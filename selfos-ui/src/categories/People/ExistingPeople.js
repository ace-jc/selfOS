import React from 'react';

import Person from './Person.js';

class ExistingPeople extends React.Component{

  constructor(props){
    super(props)
    this.state = { data: [] };
  }

  componentDidMount() {
     fetch('http://localhost:8080/getAllPeople')
      .then(res => res.json())
      .then(json => this.setState({ data: json }));
  }

  render(){
    if (this.state.data.length == 0) {
      return null;
    }else{
      return(<Person value={this.state.data}/>)
    }
  }

}

export default ExistingPeople;
