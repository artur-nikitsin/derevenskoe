import React, {Component} from 'react';
import {connect} from 'react-redux'
import {Container} from '@material-ui/core';
import {
    BrowserRouter,
    Route,
    Link
} from "react-router-dom";

class Vegetables extends Component {


    render() {

        return (
            <Container>
                <div><p>Vegetables</p></div>
            </Container>
        );
    }

}
export default Vegetables;