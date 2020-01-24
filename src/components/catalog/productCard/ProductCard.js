import React, {forwardRef, useImperativeHandle, useRef, useState} from 'react';
import {makeStyles} from '@material-ui/core/styles';
import Card from '@material-ui/core/Card';
import CardActionArea from '@material-ui/core/CardActionArea';
import CardActions from '@material-ui/core/CardActions';
import CardContent from '@material-ui/core/CardContent';
import CardMedia from '@material-ui/core/CardMedia';
import Button from '@material-ui/core/Button';
import Typography from '@material-ui/core/Typography';
import {NavLink, Route, Switch} from "react-router-dom";

import CounterButtons from "../../buttons/CounterButtons";
import AddToBucketButton from "../../buttons/AddToBucketButton";


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
                    <NavLink to={props.linkToProduct}>
                        <CardMedia
                            className={classes.media}
                            image={props.picture}
                            title={props.name + " Нажмите на изображение, чтобы узнать больше"}
                        /></NavLink>
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
                    <CounterButtons/>
                    <AddToBucketButton/>
                </CardActions>
            </Card>

        </div>


    );
}

