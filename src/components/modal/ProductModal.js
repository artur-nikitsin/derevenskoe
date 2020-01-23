/*
import React, {useEffect} from 'react';
import {makeStyles} from '@material-ui/core/styles';
import Modal from '@material-ui/core/Modal';
import {NavLink, Route, Switch} from "react-router-dom";
import Card from "@material-ui/core/Card";
import Grid from '@material-ui/core/Grid';
import "./styles/modal.scss"
import {Container} from "@material-ui/core";

function rand() {
    return Math.round(Math.random() * 20) - 10;
}

/!*function getModalStyle() {
    const top = 50 + rand();
    const left = 50 + rand();*!/

function getModalStyle() {
    const top = 50;
    const left = 50;


    return {
        top: `${top}%`,
        left: `${left}%`,
        transform: `translate(-${top}%, -${left}%)`,
    };
}

const useStyles = makeStyles(theme => ({
    paper: {
        position: 'absolute',
        display: 'flex',
        flexDirection: 'column',
        justifyContent: 'row',
        backgroundColor: theme.palette.background.paper,
        border: '2px solid #000',
        borderRadius: 20,
        boxShadow: theme.shadows[5],
        padding: theme.spacing(2, 4, 3),
    },
}));

export default function ProductModal(props) {

    const classes = useStyles();
    // getModalStyle is not a pure function, we roll the style only on the first render
    const [modalStyle] = React.useState(getModalStyle);
    const [open, setOpen] = React.useState(false);


    const handleOpen = () => {
        setOpen(true);
    };

    const handleClose = () => {
        setOpen(false);
    };


    return (
        <div>

            <Modal
                aria-labelledby="simple-modal-title"
                aria-describedby="simple-modal-description"
                open={true}
                onClose={handleClose}
                className={"productModal"}>

                <div style={modalStyle} className={classes.paper}>
                    <Card/>

                    <Grid
                        container
                        direction="row"
                        justify="space-between"
                        alignItems="space-around">

                        <NavLink to={props.linkToCloseModal}>Закрыть</NavLink>

                        <h2 id="simple-modal-description">
                            {props.name}
                        </h2>
                        <img className={"modalImgBox"} src={props.img} alt=""/>

                        <p>{props.description}</p>

                    </Grid>


                </div>
            </Modal>
        </div>
    );
}
*/


import React, {useState} from 'react';
import {Button, Modal, ModalHeader, ModalBody, ModalFooter} from 'reactstrap';
import {Redirect, Link} from "react-router-dom";

const ProductModal = (props) => {
    const {
        buttonLabel,
        className
    } = props;

    const [modal, setModal] = useState(true);

    const [redirectBack, setRedirectBack] = useState(false);

    const toggle = () => {
        setModal(!modal);
        setRedirectBack(!redirectBack);
    };

    const closeBtn = <button className="close" onClick={toggle}>&times;</button>;

    if (!redirectBack) {
        return (
            <div>

                <Modal isOpen={modal} toggle={toggle} className={className}>
                    <ModalHeader toggle={toggle} close={closeBtn}>Modal title</ModalHeader>
                    <ModalBody>

                        {props.description}
                    </ModalBody>
                    <ModalFooter>
                        <Button color="primary" onClick={toggle}>Do Something</Button>{' '}
                        <Button color="secondary" onClick={toggle}>Cancel</Button>
                    </ModalFooter>
                </Modal>
            </div>
        );
    }
    if (redirectBack) {
        return (<Redirect to={props.linkToCloseModal}/>)
    }

};

export default ProductModal;


























