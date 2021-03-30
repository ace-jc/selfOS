import React from 'react';


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
    console.log(this.state.data)
    if (this.state.data === null) {
      return null
    }else{
      return(
        <div>
          {this.state.data.map(home =>
            <div>
            {home.firstName}
            {home.lastName}
            {home.city}
            {home.aptNumber}
            {home.email}
            {home.id}
            {home.imageUrl}
            {home.phone}
            {home.state}
            {home.streetAddress}
            {home.zipCode}
            {home.lastName}
            {home.lastName}
            </div>)} </div>
      )
    }
  }

}

export default ExistingPeople;
