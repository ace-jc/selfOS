import React from 'react';


async function sendGetForAllPeople(){
  const response = await fetch('http://localhost:8080/getAllPeople', {});
  const json = await response.json();
  return json;
}


class ExistingPeople extends React.Component{

  constructor(props){
    super(props)
    this.state = {
      totalReactPackages: null
    };
  }

  render(){
    var incomingResponse;
    sendGetForAllPeople().then(response => {
      incomingResponse = response;
      console.log(incomingResponse);
    });

    return(
      <div>
        {incomingResponse}
      </div>
    )
  }

}

export default ExistingPeople;
