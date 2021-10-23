import { Component } from "react";
import Container from 'react-bootstrap/Container'
import Row from 'react-bootstrap/Row'
import Col from 'react-bootstrap/Col'
import "./App.css";

export default class App extends Component {

  constructor(props) {
    super(props);
    this.state = {
      data: []
    };
  }

  myFunction = async () => {
    const response = await fetch('https://randomuser.me/api/?results=3')
    const users = await response.json()
    this.setState({ data: users.results })
  }

  async componentDidMount() {
    this.myFunction()
  }

  render() {

    return (

      <div class="list-container">
        {
          this.state.data.map(element => {
            return (
              <Container>
                <Row>
                  <div className="user-container">
                    <Col md={4}>
                      <div>
                        <img className="image" src={element.picture.medium} alt="picture"></img>
                      </div>
                    </Col>
                    <Col className="details" md={8}>
                      <Row><p><span>My Name is: </span>{element.name.title}  {element.name.first}  {element.name.last}</p></Row>
                      <Row><p><span>Im From: {element.location.country}</span></p></Row>
                      <Row><p><span>My Email is: {element.email}</span></p></Row>
                      <Row><p><span>Phone To Contact: {element.phone}</span> </p></Row>
                    </Col>
                  </div>
                </Row>
              </Container>
            )
          })}
      </div>
    )
  }
}



