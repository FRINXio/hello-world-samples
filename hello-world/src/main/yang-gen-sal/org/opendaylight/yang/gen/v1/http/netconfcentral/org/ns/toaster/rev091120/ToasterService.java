package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import java.util.concurrent.Future;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>toaster</b>
 * <br>(Source path: <i>META-INF/yang/toaster.yang</i>):
 * <pre>
 * rpc make-toast {
 *     "Make some toast.
 *                The toastDone notification will be sent when 
 *                the toast is finished.
 *                An 'in-use' error will be returned if toast
 *                is already being made.
 *                A 'resource-denied' error will be returned 
 *                if the toaster service is disabled.";
 *     input {
 *         leaf toasterDoneness {
 *             type toasterDoneness;
 *         }
 *         leaf toasterToastType {
 *             type toasterToastType;
 *         }
 *     }
 *     
 * }
 * rpc restock-toaster {
 *     "Restocks the toaster with the amount of bread specified.";
 *     input {
 *         leaf amountOfBreadToStock {
 *             type uint32;
 *         }
 *     }
 *     
 * }
 * rpc cancel-toast {
 *     "Stop making toast, if any is being made.
 *                A 'resource-denied' error will be returned 
 *                if the toaster service is disabled.";
 * }
 * </pre>
 *
 */
public interface ToasterService
    extends
    RpcService
{




    /**
     * Make some toast. The toastDone notification will be sent when the toast is 
     * finished. An 'in-use' error will be returned if toast is already being made. A 
     * 'resource-denied' error will be returned if the toaster service is disabled.
     *
     */
    Future<RpcResult<java.lang.Void>> makeToast(MakeToastInput input);
    
    /**
     * Restocks the toaster with the amount of bread specified.
     *
     */
    Future<RpcResult<java.lang.Void>> restockToaster(RestockToasterInput input);
    
    /**
     * Stop making toast, if any is being made. A 'resource-denied' error will be 
     * returned if the toaster service is disabled.
     *
     */
    Future<RpcResult<java.lang.Void>> cancelToast();

}

