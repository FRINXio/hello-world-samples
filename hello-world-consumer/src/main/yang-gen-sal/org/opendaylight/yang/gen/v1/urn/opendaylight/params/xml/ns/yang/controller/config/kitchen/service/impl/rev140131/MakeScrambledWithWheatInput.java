package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.rpc.context.rev130617.RpcContextRef;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>kitchen-service-impl</b>
 * <br>(Source path: <i>META-INF/yang/kitchen-service-impl.yang</i>):
 * <pre>
 * container input {
 *     leaf context-instance {
 *         type instance-identifier;
 *     }
 *     uses rpc-context-ref {
 *         refine (urn:opendaylight:params:xml:ns:yang:controller:config:kitchen-service:impl?revision=2014-01-31)context-instance {
 *             leaf context-instance {
 *                 type instance-identifier;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>kitchen-service-impl/make-scrambled-with-wheat/input</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatInputBuilder
 *
 */
public interface MakeScrambledWithWheatInput
    extends
    RpcContextRef,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:kitchen-service:impl",
        "2014-01-31", "input").intern();


}

