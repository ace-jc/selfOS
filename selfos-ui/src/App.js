import React from 'react';
import './App.css';
import Navigation from './Navigation.js';


class App extends React.Component{
  constructor(props) {
  	super(props)
    this.state = {
      width: window.innerWidth,
      height: window.innerHeight,
  		hover: false,
  	};
  }

  render() {
    return (
      <Navigation navigation/>
    );
  }

}

export default App;
