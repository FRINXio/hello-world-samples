package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>toaster</b>
 * <br>(Source path: <i>META-INF/yang/toaster.yang</i>):
 * <pre>
 * container input {
 *     leaf amountOfBreadToStock {
 *         type uint32;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>toaster/restock-toaster/input</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.RestockToasterInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.RestockToasterInputBuilder
 *
 */
public interface RestockToasterInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.RestockToasterInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://netconfcentral.org/ns/toaster",
        "2009-11-20", "input").intern();

    /**
     * Indicates the amount of bread to re-stock
     *
     */
    java.lang.Long getAmountOfBreadToStock();

}

