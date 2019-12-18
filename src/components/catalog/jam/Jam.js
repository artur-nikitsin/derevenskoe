import React, {Component} from 'react';
import {connect} from 'react-redux'
import {Container} from '@material-ui/core';
import {
    BrowserRouter,
    Route,
    Link
} from "react-router-dom";

class Jam extends Component {


    render() {

        return (
            <Container>
                <div><p>Jam</p></div>
            </Container>
        );
    }

}
export default Jam;