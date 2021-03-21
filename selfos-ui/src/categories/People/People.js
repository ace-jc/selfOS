import React from 'react';
import Popup from 'reactjs-popup';
import "./People.css";
import Form from './Form.js';



class People extends React.Component{

  constructor(props){
    super(props)
  }

  render(){
    return(
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
    )
  }

}

export default People;
