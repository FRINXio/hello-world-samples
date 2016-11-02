package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.modules.module.configuration;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.modules.module.configuration.kitchen.service.impl.RpcRegistry;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.modules.module.configuration.kitchen.service.impl.NotificationService;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>kitchen-service-impl</b>
 * <br>(Source path: <i>META-INF/yang/kitchen-service-impl.yang</i>):
 * <pre>
 * case kitchen-service-impl {
 *     container rpc-registry {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:params:xml:ns:yang:controller:config:kitchen-service:impl?revision=2014-01-31)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 *     container notification-service {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:params:xml:ns:yang:controller:config:kitchen-service:impl?revision=2014-01-31)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>kitchen-service-impl/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:config:kitchen-service:impl?revision=2014-01-31)kitchen-service-impl</i>
 *
 */
public interface KitchenServiceImpl
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.modules.module.configuration.KitchenServiceImpl>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:kitchen-service:impl",
        "2014-01-31", "kitchen-service-impl").intern();

    RpcRegistry getRpcRegistry();
    
    NotificationService getNotificationService();

}

