import React, {Component} from 'react';
import {connect} from 'react-redux'
import {Container} from '@material-ui/core';
import {
    BrowserRouter,
    Route,
    Link
} from "react-router-dom";

class Bread extends Component {


    render() {

        return (
            <Container>
                <div><p>Bread</p></div>
            </Container>
        );
    }

}
export default Bread;