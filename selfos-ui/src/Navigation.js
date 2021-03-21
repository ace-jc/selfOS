import React from 'react';
import "./Navigation.css";
import ReactDOM from 'react-dom';
import { BrowserRouter, Route, Switch } from 'react-router-dom';

import Home from './categories/Home.js';
import People from './categories/People.js';
import Finances from './categories/Finances.js';
import Photos from './categories/Photos.js';
import Calendar from './categories/Calendar.js';
import Projects from './categories/Projects.js';
import Body from './categories/Body.js';
import Vehicles from './categories/Vehicles.js';
import KidsAndPets from './categories/KidsAndPets.js';
import Learning from './categories/Learning.js';
import Recipes from './categories/Recipes.js';
import Geo from './categories/Geo.js';
import Work from './categories/Work.js';
import BooksAndGames from './categories/BooksAndGames.js';


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
          <nav>
            <div>
              <a href="/Home" class="categoryItem">Home</a>
            </div>
            <div>
              <a href="/People" class="categoryItem">People</a>
            </div>
            <div>
              <a href="/Finances" class="categoryItem">Finances</a>
            </div>
            <div>
              <a href="/Photos" class="categoryItem">Photos</a>
            </div>
            <div>
              <a href="/Calendar" class="categoryItem">Calendar</a>
            </div>
            <div>
              <a href="/Projects" class="categoryItem">Projects</a>
            </div>
            <div>
              <a href="/Body" class="categoryItem">Body</a>
            </div>
            <div>
              <a href="/Vehicles" class="categoryItem">Vehicles</a>
            </div>
            <div>
              <a href="/KidsAndPets" class="categoryItem">KidsAndPets</a>
            </div>
            <div>
              <a href="/Learning" class="categoryItem">Learning</a>
            </div>
            <div>
              <a href="/Recipes" class="categoryItem">Recipes</a>
            </div>
            <div>
              <a href="/Geo" class="categoryItem">Geo</a>
            </div>
            <div>
              <a href="/Work" class="categoryItem">Work</a>
            </div>
            <div>
              <a href="/BooksAndGames" class="categoryItem">BooksAndGames</a>
            </div>
          </nav>
        </div>
        <div class="column-2">
        <BrowserRouter>
          <Switch>
            <Route exact path="/Home">
              <Home />
            </Route>
          </Switch>
          <Switch>
            <Route exact path="/People">
              <People />
            </Route>
          </Switch>
          <Switch>
            <Route exact path="/Finances">
              <Finances />
            </Route>
          </Switch>
          <Switch>
            <Route exact path="/Photos">
              <Photos />
            </Route>
          </Switch>
          <Switch>
            <Route exact path="/Calendar">
              <Calendar />
            </Route>
          </Switch>
          <Switch>
            <Route exact path="/Projects">
              <Projects />
            </Route>
          </Switch>
          <Switch>
            <Route exact path="/Body">
              <Body />
            </Route>
          </Switch>
          <Switch>
            <Route exact path="/Vehicles">
              <Vehicles />
            </Route>
          </Switch>
          <Switch>
            <Route exact path="/KidsAndPets">
              <KidsAndPets />
            </Route>
          </Switch>
          <Switch>
            <Route exact path="/Learning">
              <Learning />
            </Route>
          </Switch>
          <Switch>
            <Route exact path="/Recipes">
              <Recipes />
            </Route>
          </Switch>
          <Switch>
            <Route exact path="/Geo">
              <Geo />
            </Route>
          </Switch>
          <Switch>
            <Route exact path="/Work">
              <Work />
            </Route>
          </Switch>
          <Switch>
            <Route exact path="/BooksAndGames">
              <BooksAndGames />
            </Route>
          </Switch>
        </BrowserRouter>
        </div>
        </div>
    );
  }

}

export default Navigation;
