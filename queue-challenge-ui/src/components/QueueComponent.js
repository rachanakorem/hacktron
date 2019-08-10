import React,  { Component } from 'react';
import './component.css';

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

        showQueue : false,
        showTable  : true
    }

    showHandler = () => {
       console.log("in handler");
        this.setState({showQueue : true});
        this.setState({ showTable : false})
        console.log(this.state.showQueue);
    }
  
    render () {
      
        console.log(this.state.queueData);
       const queueData = this.state.queueData ;
       const renderFlag= this.state.showQueue;
       const showTable = this.state.showTable;
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
                
             {renderFlag && <div> helloworld</div>} 
                 
                 </div>
		</div>

       
	</div>
	
</div>


            
          </div>
        );
      }


}

export default QueueComponent;