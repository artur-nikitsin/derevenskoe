import React, {Component} from 'react';
import {Container} from '@material-ui/core';
import Grid from '@material-ui/core/Grid';

import ProductCard from "../productCard/ProductCard";

class Vegetables extends Component {


    constructor(props) {
        super(props);
        this.state = {
            products: []
        };
    }


    componentDidMount() {

        let jsonToState = (data) => {
            this.setState({products: data});
        };

        let envUrl = process.env.PUBLIC_URL;

        fetch(envUrl + "/json/vegetables.json")
            .then(
                res => {
                    if (res.status !== 200) {
                        console.log('Looks like there was a problem. Status Code: ' +
                            res.status);
                        return;
                    }
                    res.json().then(function (data) {
                        jsonToState(data)
                    });

                }
            )
            .catch(function (err) {
                console.log('Fetch Error :-S', err);
            });
    }


    render() {

        let productsToPage;
        if (this.state.products) {

            productsToPage = (this.state.products).map((item, i) => (
                <ProductCard
                    description={item.description}
                    id={i}
                    name={item.name}
                    picture={process.env.PUBLIC_URL + item.pictureUrl}
                />
            ));
        }

        return (
            <Container>

                <Grid
                    container
                    direction="row"
                    justify="space-between"
                    alignItems="space-around"

                >
                    {productsToPage}

                </Grid>


            </Container>
        );
    }

}

export default Vegetables;