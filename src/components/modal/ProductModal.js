import React, {useState} from 'react';
import {Button, ButtonGroup, Modal, ModalHeader, ModalBody, ModalFooter} from 'reactstrap';
import {Redirect, Link} from "react-router-dom";
import "./styles/modal.scss"

import CounterButtons from "../buttons/CounterButtons";
import AddToBucketButton from "../buttons/AddToBucketButton";

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

    const addButtons = <div><CounterButtons/>
        <AddToBucketButton/></div>;


    if (!redirectBack) {
        return (
            <Modal isOpen={modal} toggle={toggle} className={className}>
                <ModalHeader toggle={toggle} close={closeBtn}>{props.name}</ModalHeader>
                <ModalBody>
                    <img src={props.picture} alt=""/>
                    <div className={"modalImgWrapper"}><img src={props.img} alt={props.name}/></div>
                    {props.description}
                </ModalBody>
                <ModalFooter>

                    <CounterButtons/>
                    <AddToBucketButton/>

                    <Button outline color="secondary" onClick={toggle}>Закрыть</Button>
                </ModalFooter>
            </Modal>
        );
    }
    if (redirectBack) {
        return (<Redirect to={props.linkToCloseModal}/>)
    }

};

export default ProductModal;


























