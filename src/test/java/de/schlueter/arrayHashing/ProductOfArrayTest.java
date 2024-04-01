package de.schlueter.arrayHashing;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ProductOfArrayTest {
	@Test
	public void productExceptSelf_test(){
		int[] input = new int[]{1,2,3,4};
		int[] expected = new int[]{24,12,8,6};

		ProductOfArray sut = new ProductOfArray();

		assertArrayEquals(expected, sut.productExceptSelf(input));
	}
	@Test
	public void productExceptSelf1_test(){
		int[] input = new int[]{-1,1,0,-3,3};
		int[] expected = new int[]{0,0,9,0,0};

		ProductOfArray sut = new ProductOfArray();

		assertArrayEquals(expected, sut.productExceptSelf(input));
	}
}
