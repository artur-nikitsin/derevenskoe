import React, {Component} from 'react';
import {connect} from 'react-redux'
import {Container} from '@material-ui/core';


class Bucket extends Component {

    constructor(props) {
        super(props);
    }

    render() {


        return (
            <Container>
                <div><p>Bucket</p></div>
            </Container>
        );
    }

}
export default Bucket;