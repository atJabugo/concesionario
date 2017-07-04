import { ConPresentacionAngularPage } from './app.po';

describe('con-presentacion-angular App', () => {
  let page: ConPresentacionAngularPage;

  beforeEach(() => {
    page = new ConPresentacionAngularPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!!');
  });
});
