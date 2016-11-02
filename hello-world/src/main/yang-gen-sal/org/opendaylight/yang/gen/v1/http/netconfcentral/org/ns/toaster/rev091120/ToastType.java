package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.BaseIdentity;


/**
 * Base for all bread types supported by the toaster. New bread types not listed 
 * here nay be added in the future.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>toaster</b>
 * <br>(Source path: <i>META-INF/yang/toaster.yang</i>):
 * <pre>
 * identity toast-type {
 *     description
 *         "Base for all bread types supported by the toaster.
 *                    New bread types not listed here nay be added in the 
 *                    future.";
 *     status CURRENT;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>toaster/toast-type</i>
 *
 */
public abstract class ToastType extends BaseIdentity
 {
    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://netconfcentral.org/ns/toaster",
        "2009-11-20", "toast-type").intern();


    public ToastType() {
    
    
    }
    






}

