import React from 'react';
import "./Navigation.css";

class Navigation extends React.Component{

  constructor(props) {
    super(props)
  this.state = {
    width: this.props.width,
    height: this.props.height,
    hover: false,
  };
}

  render() {
    return (
      <div class="mainnav">
        <div class="column-1">
          <div class="category">Home</div>
          <div class="category">People</div>
          <div class="category">Finances</div>
          <div class="category">Photos</div>
          <div class="category">Calendar</div>
        </div>
        <div class="column-2">
          <div class="category">Projects</div>
          <div class="category">Body</div>
          <div class="category">Vehicles</div>
          <div class="category">Kids/Pets</div>
          <div class="category">Learning</div>
        </div>
        <div class="column-3">
          <div class="category">Recipes</div>
          <div class="category">Geo</div>
          <div class="category">Work</div>
          <div class="category">Books/Games</div>
        </div>
      </div>
    );
  }

}

export default Navigation;
