import React, {Component} from 'react';
import {connect} from 'react-redux'
import {Container} from '@material-ui/core';


class Contacts extends Component {

    constructor(props) {
        super(props);
    }

    render() {


        return (
            <Container>
                <div><p>Contacts</p></div>
            </Container>
        );
    }

}
export default Contacts;