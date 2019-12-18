import React, {Component} from 'react';
import {connect} from 'react-redux'
import {Container} from '@material-ui/core';
import {
    BrowserRouter,
    Route,
    Link
} from "react-router-dom";

class Dumplings extends Component {


    render() {

        return (
            <Container>
                <div><p>Dumplings</p></div>
            </Container>
        );
    }

}

export default Dumplings;