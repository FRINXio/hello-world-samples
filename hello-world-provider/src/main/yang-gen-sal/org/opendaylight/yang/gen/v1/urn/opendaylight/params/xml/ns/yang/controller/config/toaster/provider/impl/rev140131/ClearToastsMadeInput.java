package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.toaster.provider.impl.rev140131;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.rpc.context.rev130617.RpcContextRef;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>toaster-provider-impl</b>
 * <br>(Source path: <i>META-INF/yang/toaster-provider-impl.yang</i>):
 * <pre>
 * container input {
 *     leaf context-instance {
 *         type instance-identifier;
 *     }
 *     uses rpc-context-ref {
 *         refine (urn:opendaylight:params:xml:ns:yang:controller:config:toaster-provider:impl?revision=2014-01-31)context-instance {
 *             leaf context-instance {
 *                 type instance-identifier;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>toaster-provider-impl/clear-toasts-made/input</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.toaster.provider.impl.rev140131.ClearToastsMadeInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.toaster.provider.impl.rev140131.ClearToastsMadeInputBuilder
 *
 */
public interface ClearToastsMadeInput
    extends
    RpcContextRef,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.toaster.provider.impl.rev140131.ClearToastsMadeInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:toaster-provider:impl",
        "2014-01-31", "input").intern();


}

