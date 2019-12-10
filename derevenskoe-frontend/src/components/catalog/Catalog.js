import React, {Component} from 'react';
import {connect} from 'react-redux'
import {Container} from '@material-ui/core';


class Catalog extends Component {

    constructor(props) {
        super(props);
    }

    render() {


        return (
            <Container>
                <div><p>Catalog</p></div>
            </Container>
        );
    }

}
export default Catalog;