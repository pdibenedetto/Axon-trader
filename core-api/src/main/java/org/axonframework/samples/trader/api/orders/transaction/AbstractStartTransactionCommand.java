//package org.axonframework.samples.trader.api.orders.transaction;
//
//import org.axonframework.samples.trader.api.orders.OrderBookId;
//import org.axonframework.samples.trader.api.portfolio.PortfolioId;
//
//public class AbstractStartTransactionCommand extends TransactionCommand {
//
//    protected OrderBookId orderBookId;
//    protected PortfolioId portfolioId;
//    protected Long tradeCount;
//    protected Long pricePerItem;
//
//    public AbstractStartTransactionCommand(TransactionId transactionId,
//                                           OrderBookId orderBookId,
//                                           PortfolioId portfolioId,
//                                           Long tradeCount,
//                                           Long pricePerItem) {
//        super(transactionId);
//        this.orderBookId = orderBookId;
//        this.portfolioId = portfolioId;
//        this.tradeCount = tradeCount;
//        this.pricePerItem = pricePerItem;
//    }
//}
