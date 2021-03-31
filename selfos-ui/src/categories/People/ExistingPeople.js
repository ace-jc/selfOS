import React from 'react';

import Person from './Person.js';
import "./ExistingPeople.css";

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
      // will contain all of the users
      var allRows = [];

      this.state.data.forEach((item) => {
        allRows.push(<Person value={item}/>);
      });

      return(<div class="individuals">{allRows}</div>)
    }
  }

}

export default ExistingPeople;
