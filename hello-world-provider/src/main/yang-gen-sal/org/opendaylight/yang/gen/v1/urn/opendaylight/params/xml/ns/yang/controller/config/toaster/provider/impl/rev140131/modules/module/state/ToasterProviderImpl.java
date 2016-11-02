package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.toaster.provider.impl.rev140131.modules.module.state;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.State;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>toaster-provider-impl</b>
 * <br>(Source path: <i>META-INF/yang/toaster-provider-impl.yang</i>):
 * <pre>
 * case toaster-provider-impl {
 *     leaf toasts-made {
 *         type uint32;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>toaster-provider-impl/modules/module/state/(urn:opendaylight:params:xml:ns:yang:controller:config:toaster-provider:impl?revision=2014-01-31)toaster-provider-impl</i>
 *
 */
public interface ToasterProviderImpl
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.toaster.provider.impl.rev140131.modules.module.state.ToasterProviderImpl>,
    State
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:toaster-provider:impl",
        "2014-01-31", "toaster-provider-impl").intern();

    java.lang.Long getToastsMade();

}

