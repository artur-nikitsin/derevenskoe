import React, {Component} from 'react';
import {connect} from 'react-redux'
import {Container} from '@material-ui/core';
import {
    BrowserRouter,
    Route,
    Link
} from "react-router-dom";

class Other extends Component {


    render() {

        return (
            <Container>
                <div><p>Other</p></div>
            </Container>
        );
    }

}
export default Other;