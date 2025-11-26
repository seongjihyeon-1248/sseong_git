import React from "react";
import { Link } from "react-router-dom";
import { FaFacebook, FaTwitter, FaInstagram, FaLinkedin } from "react-icons/fa";

const Footer = () => {
  const scrollToTop = () => {
    window.scrollTo({
      top: 0,
      behavior: "smooth",
    });
  };
  return (
    <footer className="w-full bg-gray-900 text-gray-300">
      <div className="container mx-auto px-4 py-12">
        <div className="grid grid-cols-1 md:grid-cols-4 gap-8">
          <div>
            <h3 className="text-xl font-bold mb-4 ">회사 소개</h3>
            <p className="text-gray-400"> 지지가 세상에서 제일 귀엽습니다.</p>
          </div>
          <div>
            <h3 className="text-xl font-bold mb-4">빠른 링크</h3>
            <ul className="space-y-2">
              <li>
                <Link
                  to="/"
                  onClick={scrollToTop}
                  className="hover:text-white transition-colors"
                >
                  홈
                </Link>
              </li>
              <li>
                <Link
                  to="/about"
                  onClick={scrollToTop}
                  className="hover:text-white transition-colors"
                >
                  회사 정보
                </Link>
              </li>
              <li>
                <Link
                  to="/leadership"
                  onClick={scrollToTop}
                  className="hover:text-white transition-colors"
                >
                  임원 소개
                </Link>
              </li>
              <li>
                <Link
                  to="/board"
                  onClick={scrollToTop}
                  className="hover:text-white transition-colors"
                >
                  업무 게시판
                </Link>
              </li>
              <li>
                <Link
                  to="/our-services"
                  onClick={scrollToTop}
                  className="hover:text-white transition-colors"
                >
                  제공 기술
                </Link>
              </li>
              <li>
                <Link
                  to="/contact"
                  onClick={scrollToTop}
                  className="hover:text-white transition-colors"
                >
                  문의 하기
                </Link>
              </li>
            </ul>
          </div>
          <div>
            <h3 className="text-xl font-bold mb-4">연락처</h3>
            <ul className="space-y-2 text-gray-400">
              <li>지브리 스튜디오</li>
              <li>마녀배달부 지지</li>
              <li>전화: 010-2002-0106</li>
              <li>이메일: sseongl6w6l@naver.com</li>
            </ul>
          </div>
          <div>
            <h3 className="text-xl font-bold mb-4"> 소셜 미디어 </h3>
            <div className="flex space-x-4">
              <a
                href="#"
                className="text-gray-400 hover:text-white transition-colors"
              ><FaFacebook/></a>
              <a
                href="#"
                className="text-gray-400 hover:text-white transition-colors"
              ><FaInstagram/></a>
              <a
                href="#"
                className="text-gray-400 hover:text-white transition-colors"
              ><FaLinkedin/></a>
              <a
                href="#"
                className="text-gray-400 hover:text-white transition-colors"
              ><FaTwitter/></a>
            </div>
          </div>
        </div>
        <div className='border-t border-gray-800 mt-8 pt-8 text-center text-gray-400'>
            <p> &copy; 2025 Zizi_Neko Company. All rights reserved.</p>
        </div>
      </div>
    </footer>
  );
};

export default Footer;
