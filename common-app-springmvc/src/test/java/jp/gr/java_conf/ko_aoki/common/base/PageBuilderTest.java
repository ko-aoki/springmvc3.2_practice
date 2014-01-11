package jp.gr.java_conf.ko_aoki.common.base;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import jp.gr.java_conf.ko_aoki.common.base.bean.PageBean;

import org.junit.Test;

public class PageBuilderTest {

	@Test
	public void testBuild_1() {
		PageBuilder pb = new PageBuilder();
		PageBean bean;
//		bean = pb.build(1, 10, 100, 5);
//		assertThat(bean.getDispStartPage(), is(1));
//		assertThat(bean.getDispEndPage(), is(5));
//		assertThat(bean.getStartNum(), is(1));

		bean = pb.build(2, 10, 100, 5);
		assertThat(bean.getDispStartPage(), is(1));
		assertThat(bean.getDispEndPage(), is(5));
		assertThat(bean.getStartNum(), is(11));

		bean = pb.build(3, 10, 100, 5);
		assertThat(bean.getDispStartPage(), is(1));
		assertThat(bean.getDispEndPage(), is(5));
		assertThat(bean.getStartNum(), is(21));

		bean = pb.build(4, 10, 100, 5);
		assertThat(bean.getDispStartPage(), is(2));
		assertThat(bean.getDispEndPage(), is(6));
		assertThat(bean.getStartNum(), is(31));

		bean = pb.build(5, 10, 100, 5);
		assertThat(bean.getDispStartPage(), is(3));
		assertThat(bean.getDispEndPage(), is(7));
		assertThat(bean.getStartNum(), is(41));

		bean = pb.build(6, 10, 100, 5);
		assertThat(bean.getDispStartPage(), is(4));
		assertThat(bean.getDispEndPage(), is(8));
		assertThat(bean.getStartNum(), is(51));

		bean = pb.build(7, 10, 100, 5);
		assertThat(bean.getDispStartPage(), is(5));
		assertThat(bean.getDispEndPage(), is(9));
		assertThat(bean.getStartNum(), is(61));

		bean = pb.build(8, 10, 100, 5);
		assertThat(bean.getDispStartPage(), is(6));
		assertThat(bean.getDispEndPage(), is(10));
		assertThat(bean.getStartNum(), is(71));

		bean = pb.build(9, 10, 100, 5);
		assertThat(bean.getDispStartPage(), is(6));
		assertThat(bean.getDispEndPage(), is(10));
		assertThat(bean.getStartNum(), is(81));

		bean = pb.build(10, 10, 100, 5);
		assertThat(bean.getDispStartPage(), is(6));
		assertThat(bean.getDispEndPage(), is(10));
		assertThat(bean.getStartNum(), is(91));

	}

	@Test
	public void testBuild_2() {
		PageBuilder pb = new PageBuilder();
		PageBean bean;
		bean = pb.build(1, 10, 105, 6);
		assertThat(bean.getDispStartPage(), is(1));
		assertThat(bean.getDispEndPage(), is(6));
		assertThat(bean.getStartNum(), is(1));

		bean = pb.build(2, 10, 105, 6);
		assertThat(bean.getDispStartPage(), is(1));
		assertThat(bean.getDispEndPage(), is(6));
		assertThat(bean.getStartNum(), is(11));

		bean = pb.build(3, 10, 105, 6);
		assertThat(bean.getDispStartPage(), is(1));
		assertThat(bean.getDispEndPage(), is(6));
		assertThat(bean.getStartNum(), is(21));

		bean = pb.build(4, 10, 105, 6);
		assertThat(bean.getDispStartPage(), is(2));
		assertThat(bean.getDispEndPage(), is(7));
		assertThat(bean.getStartNum(), is(31));

		bean = pb.build(5, 10, 105, 6);
		assertThat(bean.getDispStartPage(), is(3));
		assertThat(bean.getDispEndPage(), is(8));
		assertThat(bean.getStartNum(), is(41));

		bean = pb.build(6, 10, 105, 6);
		assertThat(bean.getDispStartPage(), is(4));
		assertThat(bean.getDispEndPage(), is(9));
		assertThat(bean.getStartNum(), is(51));

		bean = pb.build(7, 10, 105, 6);
		assertThat(bean.getDispStartPage(), is(5));
		assertThat(bean.getDispEndPage(), is(10));
		assertThat(bean.getStartNum(), is(61));

		bean = pb.build(8, 10, 105, 6);
		assertThat(bean.getDispStartPage(), is(6));
		assertThat(bean.getDispEndPage(), is(11));
		assertThat(bean.getStartNum(), is(71));

		bean = pb.build(9, 10, 105, 6);
		assertThat(bean.getDispStartPage(), is(6));
		assertThat(bean.getDispEndPage(), is(11));
		assertThat(bean.getStartNum(), is(81));

		bean = pb.build(10, 10, 105, 6);
		assertThat(bean.getDispStartPage(), is(6));
		assertThat(bean.getDispEndPage(), is(11));
		assertThat(bean.getStartNum(), is(91));

		bean = pb.build(11, 10, 105, 6);
		assertThat(bean.getDispStartPage(), is(6));
		assertThat(bean.getDispEndPage(), is(11));
		assertThat(bean.getStartNum(), is(101));
	}

	@Test
	public void testBuild_3() {
		PageBuilder pb = new PageBuilder();
		PageBean bean = pb.build(1, 5, 8, 3);
		assertThat(bean.getDispStartPage(), is(1));
		assertThat(bean.getDispEndPage(), is(2));
		assertThat(bean.getStartNum(), is(1));
	}

}
