import React from 'react';
import Popup from 'reactjs-popup';
import "./People.css";
import Form from './Form.js';
import ExistingPeople from './ExistingPeople.js';


class People extends React.Component{

  constructor(props){
    super(props)
  }

  render(){
    return(
      <div>
        <div>
          <Popup
            trigger={<button className="button"> Create New Contact </button>}
            modal>
            {close => (
              <div className="modal">
                <button className="close" onClick={close}>
                  &times;
                </button>
                <div className="header">New contact</div>
                <Form/>
              </div>
            )}
          </Popup>
        </div>
        <div>
          <ExistingPeople />
        </div>
      </div>
    )
  }

}

export default People;
