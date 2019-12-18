import React, {Component} from 'react';
import {connect} from 'react-redux'
import {Container} from '@material-ui/core';
import {
    BrowserRouter,
    Route,
    Link
} from "react-router-dom";

class Meat extends Component {


    render() {

        return (
            <Container>
                <div><p>Meat</p></div>
            </Container>
        );
    }

}
export default Meat;