import React, {Component} from 'react';
import {connect} from 'react-redux'
import {Container} from '@material-ui/core';
import ProductCard from "../productCard/ProductCard";

class Bread extends Component {


    render() {

        return (
            <Container>
                <div><p>Bread</p></div>
                <ProductCard/>
            </Container>
        );
    }

}

export default Bread;