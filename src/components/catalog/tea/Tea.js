import React, {Component} from 'react';
import {connect} from 'react-redux'
import {Container} from '@material-ui/core';
import {
    BrowserRouter,
    Route,
    Link
} from "react-router-dom";

class Tea extends Component {


    render() {

        return (
            <Container>
                <div><p>Tea</p></div>
            </Container>
        );
    }

}
export default Tea;