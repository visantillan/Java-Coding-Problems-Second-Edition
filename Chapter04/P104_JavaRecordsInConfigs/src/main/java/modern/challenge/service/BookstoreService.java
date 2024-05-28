package modern.challenge.service;

import modern.challenge.record.BestSellerConfig;
import org.springframework.stereotype.Service;

@Service
public class BookstoreService {

    private final BestSellerConfig bestSeller;

    public BookstoreService(BestSellerConfig bestSeller) {
        this.bestSeller = bestSeller;
    }

    public String fetchBestSeller() {

        return bestSeller.author() + " | " + bestSeller.book();
    }
}
