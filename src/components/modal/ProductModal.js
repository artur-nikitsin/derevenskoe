import React, {useState} from 'react';
import {Button, ButtonGroup, Modal, ModalHeader, ModalBody, ModalFooter} from 'reactstrap';
import {Redirect, Link} from "react-router-dom";
import "./styles/modal.scss"

const ProductModal = (props) => {
    const {
        buttonLabel,
        className
    } = props;

    const [modal, setModal] = useState(true);
    const [redirectBack, setRedirectBack] = useState(false);
    const [count, setCount] = useState(0);

    const toggle = () => {
        setModal(!modal);
        setRedirectBack(!redirectBack);
    };

    const setLowCount = () => {
        if (count > 0) {
            setCount(count - 1)
        }
    };

    const setUpCount = () => {
        setCount(count + 1)
    };


    const closeBtn = <button className="close" onClick={toggle}>&times;</button>;

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

                    <ButtonGroup>
                        <Button className={"setCountButtons"} outline onClick={setLowCount}>-</Button>
                        <Button className={"counterInput"} outline>{count}</Button>
                        <Button className={"setCountButtons"} outline onClick={setUpCount}>+</Button>
                    </ButtonGroup>

                    <Button className={"addToBucketButton"} onClick={toggle}>Добавить в
                        корзину</Button>{' '}
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


























