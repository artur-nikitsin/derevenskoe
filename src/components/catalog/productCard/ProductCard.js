import React, {forwardRef, useImperativeHandle, useRef, useState} from 'react';
import {makeStyles} from '@material-ui/core/styles';
import Card from '@material-ui/core/Card';
import CardActionArea from '@material-ui/core/CardActionArea';
import CardActions from '@material-ui/core/CardActions';
import CardContent from '@material-ui/core/CardContent';
import CardMedia from '@material-ui/core/CardMedia';
import Button from '@material-ui/core/Button';
import Typography from '@material-ui/core/Typography';
import ShoppingCartIcon from '@material-ui/icons/ShoppingCart';
import {Route, NavLink} from "react-router-dom";
import ProductModal from "../../modal/ProductModal"
import Bucket from "../../bucket/Busket";


const useStyles = makeStyles({
    card: {
        maxWidth: 345,
        maxHeight: 345,
        marginTop: 20

    },
    media: {
        height: 140,
    },
});


export default function ProductCard(props) {

    const classes = useStyles();

    return (

            <div>
                <Card className={classes.card}>

                    <CardActionArea>
                        <CardMedia
                            className={classes.media}
                            image={props.picture}
                            title="Contemplative Reptile"
                        />
                        <CardContent>
                            <Typography gutterBottom variant="h5" component="h2">
                                {props.name}
                            </Typography>
                            <Typography variant="body2" color="textSecondary" component="p">
                                {props.description}
                            </Typography>
                        </CardContent>
                    </CardActionArea>
                    <CardActions>
                        <Button size="small" color="primary">
                            Подробнее
                        </Button>
                        <Button size="small" color="primary">
                            Добавить в корзину <ShoppingCartIcon/>
                        </Button>
                    </CardActions>
                </Card>

            </div>



    );
}

