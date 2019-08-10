import React,  { Component } from 'react';
import './component.css';
import axios from 'axios';

class QueueComponent extends Component {

    state = {

        queueData : [
            {
                queueName : 'sample',
                queueLimit : '25'
            },
            {
                queueName : 'sample',
                queueLimit : '25'
            },
            {
                queueName : 'sample',
                queueLimit : '25'
            }
        ],
        queueMessageData : [{"message_id":1,
        "message": "first message",
        "status" :"P"
        },
        {"message_id":2,
        "message": "first message",
        "status" :"C"
        },
        {"message_id":3,
        "message": "first message",
        "status" :"P"
        },
        {"message_id":4,
        "message": "first message",
        "status" :"C"
        },
        {"message_id":5,
        "message": "first message",
        "status" :"P"
        },
        {"message_id":6,
        "message": "first message",
        "status" :"C"
        }],

        
        
        
        mesagesData : null,
        showQueue : false,
        showTable  : true
    }

    showHandler = () => {
       console.log("in handler");
        this.setState({showQueue : true});
        this.setState({ showTable : false})
        const messageData = this.state.queueMessageData;
        const msgData = messageData.map( (message,index) => {
            
            return (
              
                <React.Fragment>
                <tr key={index}>
                 
                  <td>{message.message}</td>
                 
                </tr>
              </React.Fragment>

            )

         } )
         
         this.setState({mesagesData : msgData });

    }

    showQueuesHandler = () => {
    
        this.setState({showQueue : false});
        this.setState({ showTable : true});
    }
    
    componentDidMount () {

        // axios.get( '' )
        //             .then( response => {
        //                 // console.log(response);
        //                 this.setState( { queueData : response.data } );
        //             } );
    }
    render () {
      
        console.log(this.state.queueData);
       const queueData = this.state.queueData ;
       const renderFlag= this.state.showQueue;
       const showTable = this.state.showTable;
       const msgData = this.state. mesagesData;
       console.log(renderFlag);

         const queueTableData = queueData.map( (queue,index) => {
            
            return (
              
                <React.Fragment>
                <tr key={index}>
                  <td>{ <a href="#displayQueue" onClick={this.showHandler}>{queue.queueName }</a>}</td>
                  <td>{queue.queueLimit}</td>
                  <th className="text-center">
						<button className ="btn-primary" > Delete Queue </button>
						</th>	
                </tr>
              </React.Fragment>

            )

         } )
        return (
          <div>
            
<div className="container">
    <div className="row clearfix">
    	<div className="col-md-12 table-responsive">
			{showTable && <table className="table table-bordered table-hover table-sortable" id="tab_logic">
				<thead>
					<tr >
					
						<th className="text-center">
						   QueueName
						</th>
						<th className="text-center">
							QueueLimit
						</th>	

                        <th className="text-center">
							Delete Queue
						</th>	
					</tr>
				</thead>
				<tbody>
                    { queueTableData }
                    
                    
				</tbody>
			</table>}

            {showTable && <button className ="btn-primary"> Click here to add a Queue </button>}
            <div id="#displayQueue">
                
             {renderFlag && <table className="table table-bordered table-hover table-sortable" id="tab_logic">
				<thead>
					<tr >
					
						<th className="text-center">
						  Queue Messages
						</th>
						
					</tr>
				</thead>
				<tbody>
                    
                
                     {msgData}
                    
				</tbody>
            </table>
                    
        } 
            {renderFlag && <button className ="btn-primary" onClick= {this.showQueuesHandler} > Click to See all the Queues Data </button>}
                 </div>
		</div>

       
	</div>
	
</div>


            
          </div>
        );
      }


}

export default QueueComponent;