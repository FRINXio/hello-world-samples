package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import org.opendaylight.yangtools.yang.binding.DataRoot;


/**
 * YANG version of the TOASTER-MIB.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>toaster</b>
 * <br>Source path: <i>META-INF/yang/toaster.yang</i>):
 * <pre>
 * module toaster {
 *     yang-version 1;
 *     namespace "http://netconfcentral.org/ns/toaster";
 *     prefix "toast";
 *
 *     revision 2009-11-20 {
 *         description "YANG version of the TOASTER-MIB.
 *         ";
 *     }
 *
 *     container toaster {
 *         leaf toasterManufacturer {
 *             type DisplayString;
 *         }
 *         leaf toasterModelNumber {
 *             type DisplayString;
 *         }
 *         leaf toasterStatus {
 *             type enumeration;
 *         }
 *         leaf darknessFactor {
 *             type darknessFactor;
 *         }
 *     }
 *
 *     identity hash-brown {
 *         base "()IdentityEffectiveStatementImpl[base=null, qname=(http://netconfcentral.org/ns/toaster?revision=2009-11-20)toast-type]";
 *         description
 *             "Hash browned potatos.";
 *         status CURRENT;
 *     }
 *     identity white-bread {
 *         base "()IdentityEffectiveStatementImpl[base=null, qname=(http://netconfcentral.org/ns/toaster?revision=2009-11-20)toast-type]";
 *         description
 *             "White bread.";
 *         status CURRENT;
 *     }
 *     identity wonder-bread {
 *         base "()IdentityEffectiveStatementImpl[base=null, qname=(http://netconfcentral.org/ns/toaster?revision=2009-11-20)toast-type]";
 *         description
 *             "Wonder bread.";
 *         status CURRENT;
 *     }
 *     identity wheat-bread {
 *         base "()IdentityEffectiveStatementImpl[base=null, qname=(http://netconfcentral.org/ns/toaster?revision=2009-11-20)toast-type]";
 *         description
 *             "Wheat bread.";
 *         status CURRENT;
 *     }
 *     identity frozen-waffle {
 *         base "()IdentityEffectiveStatementImpl[base=null, qname=(http://netconfcentral.org/ns/toaster?revision=2009-11-20)toast-type]";
 *         description
 *             "Frozen waffle.";
 *         status CURRENT;
 *     }
 *     identity frozen-bagel {
 *         base "()IdentityEffectiveStatementImpl[base=null, qname=(http://netconfcentral.org/ns/toaster?revision=2009-11-20)toast-type]";
 *         description
 *             "Frozen bagel.";
 *         status CURRENT;
 *     }
 *     identity toast-type {
 *         description
 *             "Base for all bread types supported by the toaster.
 *                        New bread types not listed here nay be added in the 
 *                        future.";
 *         status CURRENT;
 *     }
 *
 *     notification toasterRestocked {
 *         description
 *             "Indicates that the toaster has run of out bread.";
 *         leaf amountOfBread {
 *             type uint32;
 *         }
 *     }
 *     notification toasterOutOfBread {
 *         description
 *             "Indicates that the toaster has run of out bread.";
 *     }
 *
 *     rpc make-toast {
 *         "Make some toast.
 *                    The toastDone notification will be sent when 
 *                    the toast is finished.
 *                    An 'in-use' error will be returned if toast
 *                    is already being made.
 *                    A 'resource-denied' error will be returned 
 *                    if the toaster service is disabled.";
 *         input {
 *             leaf toasterDoneness {
 *                 type toasterDoneness;
 *             }
 *             leaf toasterToastType {
 *                 type toasterToastType;
 *             }
 *         }
 *         
 *     }
 *     rpc restock-toaster {
 *         "Restocks the toaster with the amount of bread specified.";
 *         input {
 *             leaf amountOfBreadToStock {
 *                 type uint32;
 *             }
 *         }
 *         
 *     }
 *     rpc cancel-toast {
 *         "Stop making toast, if any is being made.
 *                    A 'resource-denied' error will be returned 
 *                    if the toaster service is disabled.";
 *     }
 * }
 * </pre>
 *
 */
public interface ToasterData
    extends
    DataRoot
{




    /**
     * Top-level container for all toaster database objects.
     *
     */
    Toaster getToaster();

}

