package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.toaster.provider.impl.rev140131;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import java.util.concurrent.Future;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>toaster-provider-impl</b>
 * <br>(Source path: <i>META-INF/yang/toaster-provider-impl.yang</i>):
 * <pre>
 * rpc clear-toasts-made {
 *     "JMX call to clear the toasts-made counter.";
 *     input {
 *         leaf context-instance {
 *             type instance-identifier;
 *         }
 *     }
 *     
 * }
 * </pre>
 *
 */
public interface ToasterProviderImplService
    extends
    RpcService
{




    /**
     * JMX call to clear the toasts-made counter.
     *
     */
    Future<RpcResult<java.lang.Void>> clearToastsMade(ClearToastsMadeInput input);

}

