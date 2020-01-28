import React, {Component} from 'react';
import {Container} from '@material-ui/core';
import Grid from '@material-ui/core/Grid';

import ProductCard from "../productCard/ProductCard";
import {NavLink, Route, Switch} from "react-router-dom";
import ProductModal from "../../modal/ProductModal";


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

        fetch(envUrl + "/json/vegetables.json", {method: "GET"})
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


        const handleClick = (val) => {
            console.log(val);
        };


        if (this.state.products) {

            productsToPage = (this.state.products).map((item, i) => (

                    <div>
                        <Route path={this.props.match.path + item.id}
                               render={() => (
                                   <ProductModal linkToCloseModal={this.props.match.path}
                                                 description={item.description}
                                                 img={process.env.PUBLIC_URL + item.pictureUrl}
                                                 name={item.name}/>)}/>


                        <Route exact={true} path={this.props.location.pathname} render={() => (
                           /* <NavLink to={this.props.match.path + item.id}>*/
                                <ProductCard
                                    linkToProduct={this.props.match.path + item.id}
                                    locationInCatalod={this.props.match.path}
                                    description={item.description}
                                    id={item.id}
                                    name={item.name}
                                    picture={process.env.PUBLIC_URL + item.pictureUrl}/>
                            /*</NavLink>*/
                        )}/>
                    </div>

                )
            );
        }


        console.log(this.props.match);
        console.log(productsToPage);

        return (


            <Container>

                <Grid
                    container
                    direction="row"
                    justify="space-between"
                    alignItems="space-around">

                    {productsToPage}

                </Grid>
            </Container>
        );
    }

}

export default Vegetables;