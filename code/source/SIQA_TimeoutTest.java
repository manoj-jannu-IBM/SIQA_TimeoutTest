

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class SIQA_TimeoutTest

{
	// ---( internal utility methods )---

	final static SIQA_TimeoutTest _instance = new SIQA_TimeoutTest();

	static SIQA_TimeoutTest _newInstance() { return new SIQA_TimeoutTest(); }

	static SIQA_TimeoutTest _cast(Object o) { return (SIQA_TimeoutTest)o; }

	// ---( server methods )---




	public static final void sleepUtils (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(sleepUtils)>> ---
		// @sigtype java 3.5
		IDataCursor cursor = pipeline.getCursor();
		long waitTime =60;
		
		if (cursor.first("waitTime")) {
		    try {
		        waitTime = Long.parseLong(cursor.getValue().toString());
		    } catch (Exception e) {
		        throw new ServiceException("Invalid waitTime input");
		    }
		}
		cursor.destroy();
		
		try {
		    Thread.sleep(waitTime);
		} catch (InterruptedException e) {
		    throw new ServiceException("Sleep interrupted");
		}
		// --- <<IS-END>> ---

                
	}
}

